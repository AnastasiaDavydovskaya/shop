package by.tms.shop.handlers;

import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(Exception.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public String exception(Exception exception, Model model){
		String errorMessage = (exception != null ? exception.getMessage() : "Неизвестная ошибка");
		model.addAttribute("errorMessage", errorMessage);
		return "error";
	}
}
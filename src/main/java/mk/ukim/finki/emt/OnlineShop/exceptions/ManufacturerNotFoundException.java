package mk.ukim.finki.emt.OnlineShop.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND,reason = "Manufacturer Not Found Exception")
public class ManufacturerNotFoundException extends RuntimeException {
}

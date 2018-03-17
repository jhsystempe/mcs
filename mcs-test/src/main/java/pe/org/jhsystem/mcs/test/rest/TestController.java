package pe.org.jhsystem.mcs.test.rest;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.org.jhsystem.mcs.test.bean.Respuesta;

@RestController
@RequestMapping("/servicio/test/v1.0")
public class TestController {

    @GetMapping(value="/acceso", produces = "application/json; charset=UTF-8")
    public final Respuesta testAcceso() throws UnknownHostException {
    	Respuesta respuesta = new Respuesta();
    	respuesta.setCoError("0000");
    	respuesta.setDeHost(InetAddress.getLocalHost().getHostAddress());
    	respuesta.setDeMensaje("TODO OK");
    	SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHHmmss");
    	respuesta.setFhHost(format.format( new Date()));
        return respuesta;
    }
	
}

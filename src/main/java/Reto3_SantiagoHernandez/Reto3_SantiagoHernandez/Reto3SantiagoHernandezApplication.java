        //1. modelo o intidad
//2. interpaz
//3. repositorio
//4. Servicios
//5. controlador o web
package Reto3_SantiagoHernandez.Reto3_SantiagoHernandez;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.stereotype.Component;

//@EntityScan(basePackages = {})
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class, JpaRepositoriesAutoConfiguration.class})
@Component
//@SpringBootApplication
public class Reto3SantiagoHernandezApplication {

	public static void main(String[] args) {
		SpringApplication.run(Reto3SantiagoHernandezApplication.class, args);
	}

}

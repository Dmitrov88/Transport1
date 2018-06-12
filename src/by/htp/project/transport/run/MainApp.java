package by.htp.project.transport.run;

import by.htp.project.transport.entity.Report;
import by.htp.project.transport.entity.Transport;
import by.htp.project.transport.entity.transports.AirAuto;
import by.htp.project.transport.entity.transports.AirMoto;

public class MainApp {

	public static void main(String[] args) {
		/* транспортные средства будущего
		вести учет транспрота вывести на экран 
		сортировка по стоимости проезда
		скорости премещения из а в б
		количество не меннее 10 *
		*/
		Transport[] transport = {new AirAuto("tr1", 2, 67), new AirMoto("tr2", 3, 4)};
		Report report = new Report();
		report.setTransport(transport);
		report.display();
	

	}

}

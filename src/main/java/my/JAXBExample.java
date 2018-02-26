package my;

import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import my.jaxb.Result;
import my.jaxb.CodeType;

public class JAXBExample {
	public static void main(String[] args) {

		Result result = new Result();
		result.setBookId("Book");
		result.setCode(CodeType.OK);

		try {

			File file = new File("file.xml");
			JAXBContext jaxbContext = JAXBContext.newInstance(Result.class);
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

			// output pretty printed
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

			jaxbMarshaller.marshal(result, file);
			jaxbMarshaller.marshal(result, System.out);

		} catch (JAXBException e) {
			e.printStackTrace();
		}

	}
}
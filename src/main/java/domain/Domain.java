package domain;

import java.sql.SQLException;

import org.springframework.context.support.ClassPathXmlApplicationContext; // Добавляем библиотеку в класс

import entity.Client;  // Добавляем нужные созданные ранее вспомогательные классы
import entity.TypeTraining;
import repository.ClientRepository;
import repository.TypeTrainingRepository;

public class Domain {
	
	public static void main(String[] args) throws SQLException{
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml"); // Создаем связь с нашим файлом, для того чтобы программа взяла все нужные данные для подключения к базе данных
		
		TypeTrainingRepository typeTrainingRepos = context.getBean(TypeTrainingRepository.class); // Создаем обьект класса Type Training c соответствующим подключением к файлам bean
		ClientRepository clientRepos = context.getBean(ClientRepository.class); // Создаем обьект класса ClientRepository c соответствующим подключением к файлам bean, чтобы обьявить все из интерфейса
		
		TypeTraining type_tr = new TypeTraining(); // Создаем обьект класса typeTraining
		type_tr.setNameTraining("Test Spring"); // Добавляем новую тренировку в таблицу Type Training
		
		Client client = new Client(); // Создаем обьект класса Client
		client.setFIO_Client("Test Test Test");  // Добавляем информацию о новом клиенте в таблицу базы данных
		client.setPol("M");
		client.setTelefon("078123456");
		client.setRost(165L);
		client.setVes(65L);
		client.setAge(25L);
		
		typeTrainingRepos.save(type_tr); //Сохраняем все изменения
		clientRepos.save(client); // И отправляем их в базу данных
		
	}
	
}

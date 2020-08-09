package entity;

import java.sql.Date; // Подключаем для работы с Датой в Sql
import java.sql.Time; // Подключаем для работы с Временем в Sql

import javax.persistence.*; // Так как у нас JPA, подключаем persistence в наш класс

@Table(name = "GraphTraining") // Здесь мы указываем аннотацию, что данный класс будет таблицей, а так же указываем название таблицы
public class GraphTraining{
	
	@ManyToMany // Данная анотация указывает на связь Многие ко Многим с другой таблицей Client
	private Long CodClient; // Так мы обьявляем атрибуты private Тип данных атрибута название
	
	@ManyToMany // Данная анотация указывает на связь Многие ко Многим с другой таблицей TypeTraining
	private Long CodTraining;
	
	@Column(name = "DataBeginTraining") // Данная анотация указывает на атрибут, то есть каждая колонка, это отдельный атрибут таблицы, а также указываем имя атрибута
	private Date DataBeginTraining;
	
	@Column(name = "TimeBeginTraining")
	private Time TimeBeginTraining;
	
	@Column(name = "DurationTraining")
	private Long DurationTraining;
	
	public GraphTraining() { // Здесь мы создаем конструктор по умолчанию
		
	}

	public Long getCodClient() {
		return CodClient;
	} // Создаем getters and setters, для того чтобы мы могли получать и передавать значения из таблиц

	public void setCodClient(Long codClient) {
		CodClient = codClient;
	}

	public Long getCodTraining() {
		return CodTraining;
	}

	public void setCodTraining(Long codTraining) {
		CodTraining = codTraining;
	}

	public Date getDataBeginTraining() {
		return DataBeginTraining;
	}

	public void setDataBeginTraining(Date dataBeginTraining) {
		DataBeginTraining = dataBeginTraining;
	}

	public Time getTimeBeginTraining() {
		return TimeBeginTraining;
	}

	public void setTimeBeginTraining(Time timeBeginTraining) {
		TimeBeginTraining = timeBeginTraining;
	}

	public Long getDurationTraining() {
		return DurationTraining;
	}

	public void setDurationTraining(Long durationTraining) {
		DurationTraining = durationTraining;
	}

	@Override // Здесь мы переопределяем метод ToString, для удобного вывода на экран всех данных
	public String toString() {
		return "GraphTraining [CodClient=" + CodClient + ", CodTraining=" + CodTraining + ", DataBeginTraining="
				+ DataBeginTraining + ", TimeBeginTraining=" + TimeBeginTraining + ", DurationTraining="
				+ DurationTraining + "]";
	}
	
	
}
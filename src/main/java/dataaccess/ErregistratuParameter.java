package dataaccess;

import java.util.Date;

public class ErregistratuParameter {
	public String izena;
	public String abizena;
	public Date jaiotzeData;
	public String sexua;
	public String erabiltzaileMota;
	public String email;
	public String pasahitza;

	public ErregistratuParameter(String izena, String abizena, Date jaiotzeData, String sexua, String erabiltzaileMota,
			String email, String pasahitza) {
		this.izena = izena;
		this.abizena = abizena;
		this.jaiotzeData = jaiotzeData;
		this.sexua = sexua;
		this.erabiltzaileMota = erabiltzaileMota;
		this.email = email;
		this.pasahitza = pasahitza;
	}
}
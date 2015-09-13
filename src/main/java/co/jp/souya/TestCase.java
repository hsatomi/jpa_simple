package co.jp.souya;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


/**
 * The persistent class for the "TestCase" database table.
 * 
 */
@Entity
@Table(name="\"TestCase\"")
@NamedQueries({
	@NamedQuery(name="TestCase.findAll", query="SELECT t FROM TestCase t")
,	@NamedQuery(name="TestCase.findById", query="SELECT t FROM TestCase t where PJid=:PJid")	
})
public class TestCase implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="\"id\"")
	private int id;

	private String テスト名;

	@Lob
	private Object バイナリ;

	public TestCase() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getテスト名() {
		return this.テスト名;
	}

	public void setテスト名(String テスト名) {
		this.テスト名 = テスト名;
	}

	public Object getバイナリ() {
		return this.バイナリ;
	}

	public void setバイナリ(Object バイナリ) {
		this.バイナリ = バイナリ;
	}

}
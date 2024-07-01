package ch08.lineage.DTO;

public class Account {
	// 필드
	private String id;
	private String pw;
	private String nn;
	// private KnightDTO knightDTO; // 기사 객체
	// private ElfDTO elfDTO; // 요정 객체
	private HumanDTO humanDTO; 

	// 생성자

	// 메서드
	public String getId() {
		return id;
	}

	public String getPw() {
		return pw;
	}

	public String getNn() {
		return nn;
	}

	// public KnightDTO getKnightDTO() {
	// return knightDTO;
	// }

	// public ElfDTO getElfDTO() {
	// return elfDTO;
	// }

	public void setId(String id) {
		this.id = id;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public void setNn(String nn) {
		this.nn = nn;
	}

	public HumanDTO getHumanDTO() {
		return humanDTO;
	}

	public void setHumanDTO(HumanDTO humanDTO) {
		this.humanDTO = humanDTO;
	}

	// public void setKnightDTO(KnightDTO knightDTO) {
	// this.knightDTO = knightDTO;
	// }

	// public void setElfDTO(ElfDTO elfDTO) {
	// this.elfDTO = elfDTO;
	// }

}

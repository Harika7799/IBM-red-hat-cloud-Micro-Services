package comm.example;

public class Team {
	
	
	private String TeamId;
	private String TeamDesc;
	private Integer TeamPriority;
	public Team() {
		super();
	}
	public Team(String teamId, String teamDesc, Integer teamPriority) {
		super();
		this.TeamId = teamId;
		this.TeamDesc = teamDesc;
		this.TeamPriority = teamPriority;
	}
	public String getTeamId() {
		return TeamId;
	}
	public void setTeamId(String teamId) {
		TeamId = teamId;
	}
	public String getTeamDesc() {
		return TeamDesc;
	}
	public void setTeamDesc(String teamDesc) {
		TeamDesc = teamDesc;
	}
	public Integer getTeamPriority() {
		return TeamPriority;
	}
	public void setTeamPriority(Integer teamPriority) {
		TeamPriority = teamPriority;
	}
	@Override
	public String toString() {
		return "Team [TeamId=" + TeamId + ", TeamDesc=" + TeamDesc + ", TeamPriority=" + TeamPriority + "]";
	}
	

}

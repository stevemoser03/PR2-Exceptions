package exceptions.ue.transporter;

public class Transporter {

	public void beam(String person, String from, String to, boolean urgent) 
			throws TransporterMalfunctionException{
			if(urgent && Math.random()<0.70){
				throw new TransporterMalfunctionException("BEAM FAIL");
			}
		System.out.println(person + "wird von "+from + "nach "+ to + "gebeamt. Dringlichkeit: "+urgent);
	}
	
	public void shutdown(){
		System.out.println("ATTENTION: Shutdown in progress!");
	}
	
}

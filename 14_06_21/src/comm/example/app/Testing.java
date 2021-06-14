package comm.example.app;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.UUID;
import comm.example.Desc_C;
import comm.example.Priority_C;
import comm.example.Team;
public class Testing {
	
private static Scanner sc =new Scanner(System.in);
	public static void main(String[] args) {
		int s =0;
		Desc_C d =new Desc_C();
		Priority_C p =new Priority_C();
		Set<Team> set =new TreeSet<Team>(p);
		
		
		set.add(new Team(UUID.randomUUID().toString(),"Compile",5));
		set.add(new Team(UUID.randomUUID().toString(),"Analysis",4));
		set.add(new Team(UUID.randomUUID().toString(),"Bytecode",3));
		for(Team t:set)
		{
			System.out.println(t);
		}
		Set s1 =new TreeSet<>();
		s1.size();
		s1.add(50);
		s1.add(20);
		s1.add(90);
		s1.add(1000);
		System.out.println(s1);
		
		do { 
			System.out.println("Enter ur Choice :");
			System.out.println("1.Create :");
			System.out.println("2.Dispaly :");
			System.out.println("3.Update :");
			System.out.println("4.Remove :");
			System.out.println("0.Exit:");
			s=sc.nextInt();
			switch(s){
				case 1:
					System.out.println("Description");
					String teamDesc =sc.next();
					System.out.println("Prior:");
					int teamPriority =sc.nextInt();
					set.add(new Team(UUID.randomUUID().toString(),teamDesc,teamPriority));
					System.out.println("Created Successfully...");
					break;
				case 2:
					System.out.println("Enter Team Id:");
					String TeamId =sc.next();
					Team t1 =null;
					Iterator<Team>i =set.iterator();
					while(i.hasNext()) {
					t1=i.next();
					if(t1.getTeamId().equals(TeamId)) {
						System.out.println("Found :"+ t1);
					    set.add(t1);
						set.remove(t1);
						System.out.println("Removed .....");
						break;
					}
					else
					{
						System.out.println("Invalid Id");
						break;
					}
					}	
					break;
				case 3:
					System.out.println("Enter Team Id ");
					String TeamId1 =sc.next();
					Team t2=null;
					Iterator<Team>i1 =set.iterator();
					while(i1.hasNext()) {
					t2=i1.next();
					if(t2.getTeamId().equals(TeamId1)) {
						System.out.println("Found :"+ t2);
					    set.add(t2);
						set.remove(t2);
						System.out.println("Removed .....");
						System.out.println("Description");
						String teamDesc1 =sc.next();
						System.out.println("Prior:");
						int teamPriority1 =sc.nextInt();
						set.add(new Team(UUID.randomUUID().toString(),teamDesc1,teamPriority1));
						System.out.println("Updated Successfully...");
						break;
					}
					else 
					{
						System.out.println("Invalid Id");
					}
					
					}
				break;
				
				case 4:
					
		                     for(Team t:set) {
			             System.out.println(t);
		                         }
		break;
				case 0:
					
					System.out.println("Exit From System");
					System.exit(0);
					break;
					
				default:
					System.out.println("Invalid One Try Again...");
					break;
					}
	
			}while(s!=0);
			
		}
	}
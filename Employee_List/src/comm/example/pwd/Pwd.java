package comm.example.pwd;

public class Pwd 
{
	public static boolean validatePassword(String password) 
	{
		boolean valid =true;
		int i;
		int length =password.length();
		if(length > 8) {
			for(i=0;i < length;i++)
			{
				char ch =password.charAt(i);
				if(Character.isLowerCase(ch))
					break;
			}
			if(i > 8)
				return false;
			for (i=0;i < length;i++) 
			{
				char ch =password.charAt(i);
				if(Character.isUpperCase(ch))
					break;
			}
			if(i>8)
				return false;
			for(i=0;i<length;i++)
			{
				char ch=password.charAt(i);
				if(Character.isDigit(ch))
					break;
			}
			if(i>8)
				return false;
				for(i=0;i<length;i++) 
				{
					char ch=password.charAt(i);
					if(!Character.isDigit(ch) && !Character.isLowerCase(ch) &&!Character.isUpperCase(ch))
						break;
				}
				if(i > 8) 
					return false;
					if(password.contains(" "))
						return false;
				}
				return valid;
			}
		}
		

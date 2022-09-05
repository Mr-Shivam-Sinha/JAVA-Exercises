class WordChallenge
{
	static int freq[] = new int [26];

	public static void setFreq(char ch[]){
		for(int i=0;i<ch.length;i++){
			int j = ch[i];
			j = j-97;

			freq[j]++;
		}
	}

	public void identifyWord(char arr[],String st[],String mask){

		setFreq(arr);

		for(String s:st){

			int f[] = new int[26];

			if(s.length()!=mask.length())
				continue;

			int flag = 0;
			for(int i=0;i<s.length();i++){
				char ch1 = s.charAt(i);
				char ch2 = mask.charAt(i);
				
				int j = ch1;
				j= j-97;
				f[j]++;

				if(f[j]>freq[j]){
					flag = 1;
					break;
				}

				if(ch2=='*'){


				}else{
					if(ch1!=ch2){
						flag = 1;
						break;
					}

				}
			}

			if(flag==0)
				System.out.println(s);
		}

	}

	public static void main(String args[]){
		// System.out.println("Enter mask:")
		// Scanner sc=new Scanner();
		// st=sc.next();

		String st[] = {"red", "cee", "cede", "code","read", "creed", "decree"};
		char ch[] = {'e', 'c', 'r', 'e', 'e','d','a','o'};

		WordChallenge w=new WordChallenge();
		w.identifyWord(ch,st,"*e**");

	}

}
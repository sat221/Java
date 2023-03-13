package test;

public class BufferBuilder {
		static StringBuilder StringBuilderConcate() {
			 StringBuilder a=new StringBuilder("Satish");
			 for(int i=0;i<1000;i++) {
				 a.append(" Borale");
			 }
			 return a;
		 }
		static StringBuffer StringBufferConcate() {
			 StringBuffer a=new StringBuffer("Satish");
			 for(int i=0;i<1000;i++) {
				 a.append(" Borale");
			 }
			 return a;
		 }
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			long startTime = System.currentTimeMillis();
			StringBuilderConcate();
			System.out.println(System.currentTimeMillis()-startTime);
			startTime = System.currentTimeMillis();
			StringBufferConcate();
			System.out.println(System.currentTimeMillis()-startTime);
			
			//hashcode
			/*System.out.println("String hashcode");
			String a=new String("Satish");
			System.out.println(a.hashCode());
			a=a+" borale";
			System.out.println(a.hashCode());
			System.out.println("string buffer hashcode");
			StringBuffer b=new StringBuffer("Satish");
			System.out.println(b.hashCode());
			b.append(" borale");
			System.out.println(b.hashCode());*/
		}

	}


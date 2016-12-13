package withoutDI

class WithoutDIClass {

	public static void main(String[] args){
		ProvideServices serviceProvider=new ProvideServices();
		String receiver="Groovy"
		String message="Hi please start to use DI";
		serviceProvider.requestMail(message,receiver);
	}
}


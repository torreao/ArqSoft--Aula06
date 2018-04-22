// Marcelo Torreão 816113657 SI3AN-MCA
public interface Ex01 {

	abstract class AbstractProdutoA {
        public abstract void helloWorld();
        
}

class ProdutoA1 extends AbstractProdutoA {

        ProdutoA1(String arg) {
                  System.out.println("Hello World "+arg);
        } 

        public void operacaoA1() { 
             
        };

        public void operacaoA2() { 
            
        }

		@Override
		public void helloWorld() {
			// TODO Auto-generated method stub
			
		};
}

class ProdutoA2 extends AbstractProdutoA {

        ProdutoA2(String arg) {
                  System.out.println("Hello World! "+arg);
        } 


		@Override
		public void helloWorld() {
			// TODO Auto-generated method stub
			
		};
}
	
}

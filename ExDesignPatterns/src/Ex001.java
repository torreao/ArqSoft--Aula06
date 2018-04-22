// Marcelo Torreão 816113657 SI3AN-MCA
public interface Ex001 {

	
	abstract class AbstractProdutoB {
        public abstract void operacaoB1();
        public abstract void operacaoB2();
}

class ProdutoB1 extends AbstractProdutoB {
        ProdutoB1(String arg) {
                  System.out.println("Hello World "+arg);
        }

		@Override
		public void operacaoB1() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void operacaoB2() {
			// TODO Auto-generated method stub
			
		}
}

class ProdutoB2 extends AbstractProdutoB {
        ProdutoB2(String arg) {
                  System.out.println("Hello World "+arg);
        }

		@Override
		public void operacaoB1() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void operacaoB2() {
			// TODO Auto-generated method stub
			
		}
}
}

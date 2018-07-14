import org.hibernate.Session;
import com.wjcs.sistemavenda.HibernateUtil;

public class Conecta {
   
   public static void main(String[] args){
      Session sessao = null;
      try {
         sessao = HibernateUtil.getSession().openSession();
         System.out.println("Conectou!!!");
      }finally {
         sessao.close();
         System.out.println("Fechou a Conexão!");
      }
      
   }
}

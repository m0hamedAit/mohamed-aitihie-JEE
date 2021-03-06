package testAnnotations.metier;

import annotations.Autowired;
import annotations.Component;
import testAnnotations.dao.IDao;

@Component
public class MetierImpl implements IMetier {
    @Autowired
    private IDao dao;

    public MetierImpl() {
        System.out.println("MetierImpl created...");
    }

    @Override
    public int calcul(){
        System.out.println("Version dataBase");
        return dao.getData() * 4 ;
    }

    public void setDao(IDao dao) {
        this.dao = dao;
    }
}

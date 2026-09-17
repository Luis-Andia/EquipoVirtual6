package pe.edu.upc.equipovirtual6.ServicesImplements;

import pe.edu.upc.equipovirtual6.Repositories.IMedicalCategoryRepository;
import pe.edu.upc.equipovirtual6.ServicesInterfaces.IMedicalCategoryService;

public class MedicalCategoryServiceImplement implements IMedicalCategoryService {
    private  final IMedicalCategoryRepository cR;

    public MedicalCategoryServiceImplement(IMedicalCategoryRepository cR) {
        this.cR = cR;
    }

    @Override
    public void delete(Long id) {
        cR.deleteById(id);
    }
}

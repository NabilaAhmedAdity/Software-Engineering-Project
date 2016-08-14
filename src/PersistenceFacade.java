
import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nabila
 */
public class PersistenceFacade {
    
    private static PersistenceFacade instance;
    static HashMap<Class, IMapper> mappers;
    
    PersistenceFacade(){
        mappers = new HashMap<Class, IMapper>();
        mappers.put(Course.class, new CourseMapper());
    }
    
    public static synchronized PersistenceFacade getInstance(){
        if(instance == null){
            instance = new PersistenceFacade();
        }
        return instance;
    }
    public static Object get(int oid, Class course)
    { 
        
        IMapper mapper = (IMapper)mappers.get(course);
        return mapper.get(oid);
    }
    
}

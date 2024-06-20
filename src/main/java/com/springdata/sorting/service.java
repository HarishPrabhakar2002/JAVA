package com.springdata.sorting;
    import jakarta.annotation.PostConstruct;
    import org.springframework.beans.factory.annotation.Autowired;

    import org.springframework.data.domain.Page;
    import org.springframework.data.domain.PageRequest;
    import org.springframework.data.domain.Pageable;
    import org.springframework.data.domain.Sort;
    import org.springframework.stereotype.Service;

    import java.util.List;


@Service
    public class service {

        @Autowired
        private repo userRepository;



        public List<entity>give(){
            return userRepository.findAll();
        }
        public entity getbyid(long id){
            return userRepository.findById(id).orElse(null);
        }
        public entity post(entity nam){
            return userRepository.save(nam);
        }

//                  CHATGPT
//            public Page<entity> getAllUsersWithPagination(int page, int size) {
//                PageRequest pageable = PageRequest.of(page, size);
//                //Page<entity> userPage =
//                   return  userRepository.findAll(pageable);
//
//            }
//            public List<entity>findbysort(String athula){
//            return userRepository.findAll(Sort.by(Sort.Direction.ASC,athula));
//            }
   // public List<entity>desc(String give){
//        return userRepository.findAll(Sort.by(Sort.Direction.DESC,give));
//    }

//            YOUTUBE
//    @PostConstruct
//    public  void dataallelem(){
//        List<entity> en= IntStream.rangeClosed(1,500)
//                .mapToObj(x ->  new entity("Booked"+x,new Random().nextLong(1000),new Random().nextLong(1000)))
//                .collect(Collectors.toList());
//        userRepository.saveAll(en);
//    }
    public Page <entity>getvalue(int page,int size,String sortby){
        Pageable send=PageRequest.of(page,size,Sort.by(sortby).ascending());
        return userRepository.findAll(send);
    }
}









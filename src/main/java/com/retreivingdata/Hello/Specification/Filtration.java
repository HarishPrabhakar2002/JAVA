package com.retreivingdata.Hello.Specification;
import com.retreivingdata.Hello.TableCreation.Employee;
import org.springframework.data.jpa.domain.Specification;

public class Filtration {
    public static Specification<Employee>   callingByName(String Bookname) {
        return ((root, query, criteriaBuilder) ->
                criteriaBuilder.equal(root.get("Bookname"), Bookname));
    }

    public static Specification<Employee> betweenNumbers(int lowerBound, int upperBound) {
        return ((root, query, criteriaBuilder) ->
                criteriaBuilder.between(root.get("Bookcode"), lowerBound, upperBound));
    }



    public static Specification<Employee> priceBetween(long greater,long lesser) {
        return (root, query, criteriaBuilder) ->{
            return criteriaBuilder.and(
            criteriaBuilder.greaterThanOrEqualTo(root.get("Bookprice"), greater),
                    criteriaBuilder.lessThanOrEqualTo(root.get("Bookprice"), lesser));
    };
    }

    public static Specification<Employee> authorStartsWithAndEndsWith(char startLetter, char endLetter) {
        return (root, query, criteriaBuilder) -> {
            return criteriaBuilder.and(
                    criteriaBuilder.like(root.get("Author"), startLetter + "%"),
                    criteriaBuilder.like(root.get("Author"), "%" + endLetter)
            );
        };
    }
}


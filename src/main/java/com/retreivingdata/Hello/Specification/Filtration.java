package com.retreivingdata.Hello.Specification;
import com.retreivingdata.Hello.TableCreation.Table;
import org.springframework.data.jpa.domain.Specification;

public class Filtration {
    public static Specification<Table>callingByName(String Bookname) {
        return ((root, query, criteriaBuilder) ->
                criteriaBuilder.equal(root.get("Bookname"), Bookname));
    }

    public static Specification<Table>betweenNumbers(int lowerBound, int upperBound) {
        return ((root, query, criteriaBuilder) ->
                criteriaBuilder.between(root.get("Bookcode"), lowerBound, upperBound));
    }

    public static Specification<Table> priceBetween(long greater,long lesser) {
        return (root, query, criteriaBuilder) ->{
            return criteriaBuilder.and(
            criteriaBuilder.greaterThanOrEqualTo(root.get("Bookprice"), greater),
                    criteriaBuilder.lessThanOrEqualTo(root.get("Bookprice"), lesser));
    };
    }

    public static Specification<Table> authorStartsWithAndEndsWith(char startLetter, char endLetter) {
        return (root, query, criteriaBuilder) -> {
            return criteriaBuilder.and(
                    criteriaBuilder.like(root.get("Author"), startLetter + "%"),
                    criteriaBuilder.like(root.get("Author"), "%" + endLetter)
            );
        };
    }
}


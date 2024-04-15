package enums;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;
import org.springframework.validation.beanvalidation.SpringValidatorAdapter;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
public enum SubscriptionsEn {

    STARTER("STARTER",""),
    MASTER("MASTER",),
    LEGEND("LEGEND",)

    String type;
    String description;
    double price;
    int countTries;

    private SubscriptionsEn(String type, String description,double price, int countTries)
    {
        this.type = type;
        this.description=description;
        this.price=price;
        this.countTries = countTries;
    }


}

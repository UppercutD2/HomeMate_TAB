package model;

import enums.SubscriptionsEn;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
public class SubscriptionCL {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    SubscriptionsEn SubscriptionType;
}

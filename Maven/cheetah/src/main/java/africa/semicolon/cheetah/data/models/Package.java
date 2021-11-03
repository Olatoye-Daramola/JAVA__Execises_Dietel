package africa.semicolon.cheetah.data.models;

import lombok.Data;

@Data
public class Package {
    private Integer trackingNumber;
    private String name;
    private String senderName;
    private String senderPhone;
    private String receiverName;
    private String receiverPhone;
    private String deliveryAddress;
    private double netWeight;
}
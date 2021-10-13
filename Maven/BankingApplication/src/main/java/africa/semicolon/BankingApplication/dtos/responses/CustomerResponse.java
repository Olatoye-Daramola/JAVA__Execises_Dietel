package africa.semicolon.BankingApplication.dtos.responses;

import lombok.Data;

@Data
public class CustomerResponse {
    private String firstName;
    private String lastName;
    private String bvn;
    private int numberOfAccounts;
}

package admin;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
public class Admin {

    private double id;
    private int pw;

    public Admin(double id, int pw) {
        this.id = id;
        this.pw = pw;
    }

    public boolean check(double id, int pw) {
        return (this.id == id && this.pw == pw);
    }
}

package model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class SignUpInfo {

    public SignUpInfo() {}

    private int courseIndex;

    private int levelIndex;

    private String name;

    private String email;

    private String message;
}

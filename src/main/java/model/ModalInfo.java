package model;

import lombok.*;
import selenium.modals.EnrollMeModal;

@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode
public class ModalInfo {

    private String courseName;

    private String level;

    private String name;

    private String email;

    public ModalInfo(EnrollMeModal enrollMeModal) {
        this.courseName = enrollMeModal.getChosenCourse().getAttribute("innerHTML");
        this.level = enrollMeModal.getChosenLevel().getAttribute("innerHTML");
        this.name = enrollMeModal.getUsername().getAttribute("innerHTML");
        this.email = enrollMeModal.getEmail().getAttribute("innerHTML");
    }

    public ModalInfo () {

    }


}

package daou.daou_task.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class DagsModel {
    private String occurrence_time;
    private String folder;
    private String url;
    private String code;
    private String time;
    private String message;
    private String body;
}
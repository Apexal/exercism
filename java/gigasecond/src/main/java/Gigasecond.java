import java.time.LocalDate;
import java.time.LocalDateTime;

class Gigasecond {
    int seconds = 1000000000;
    LocalDateTime birthDateTime;

    Gigasecond(LocalDate birthDate) {
        this.birthDateTime = birthDate.atStartOfDay();
    }

    Gigasecond(LocalDateTime birthDateTime) {
        this.birthDateTime = birthDateTime;
    }

    LocalDateTime getDate() {
        return birthDateTime.plusSeconds(seconds);
    }

}

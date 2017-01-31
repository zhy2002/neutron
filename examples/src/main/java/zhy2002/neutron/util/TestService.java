package zhy2002.neutron.util;

import javax.inject.Inject;
import java.util.Optional;

/**
 * A class for dagger tests.
 */
public class TestService {

    private final DateTimeService dateTimeService;

    @Inject
    public TestService(DateTimeService dateTimeService) {
        this.dateTimeService = dateTimeService;
    }

    public DateTimeService getDateTimeService() {
        return dateTimeService;
    }

    public Optional<String> getMessage() {
        if(dateTimeService != null)
            return Optional.of(dateTimeService.toString());
        return Optional.empty();
    }
}

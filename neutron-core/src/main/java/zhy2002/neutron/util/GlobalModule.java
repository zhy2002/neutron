package zhy2002.neutron.util;

import dagger.Module;
import dagger.Provides;

/**
 * The global dagger module.
 */
@Module
class GlobalModule {

    @Provides
    static DateTimeService getDateTimeService() {
        return new DateTimeService();
    }

}

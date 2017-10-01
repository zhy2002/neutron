package zhy2002.mortgage.di;

import dagger.Module;
import dagger.Provides;

@Module
public class MyOtherModule {

    @Provides
    MyDataReader getMyDataReader() {
        MyDataReader dataReader = new MyDataReader();
        dataReader.setValue("in MyOtherModule");
        return dataReader;
    }
}

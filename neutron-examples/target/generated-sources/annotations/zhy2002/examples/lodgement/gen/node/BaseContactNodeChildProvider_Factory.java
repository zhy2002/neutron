package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class BaseContactNodeChildProvider_Factory
    implements Factory<BaseContactNodeChildProvider> {
  private final MembersInjector<BaseContactNodeChildProvider>
      baseContactNodeChildProviderMembersInjector;

  public BaseContactNodeChildProvider_Factory(
      MembersInjector<BaseContactNodeChildProvider> baseContactNodeChildProviderMembersInjector) {
    assert baseContactNodeChildProviderMembersInjector != null;
    this.baseContactNodeChildProviderMembersInjector = baseContactNodeChildProviderMembersInjector;
  }

  @Override
  public BaseContactNodeChildProvider get() {
    return MembersInjectors.injectMembers(
        baseContactNodeChildProviderMembersInjector, new BaseContactNodeChildProvider());
  }

  public static Factory<BaseContactNodeChildProvider> create(
      MembersInjector<BaseContactNodeChildProvider> baseContactNodeChildProviderMembersInjector) {
    return new BaseContactNodeChildProvider_Factory(baseContactNodeChildProviderMembersInjector);
  }
}

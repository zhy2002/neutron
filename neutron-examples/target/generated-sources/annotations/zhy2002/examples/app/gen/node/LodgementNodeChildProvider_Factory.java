package zhy2002.examples.app.gen.node;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class LodgementNodeChildProvider_Factory
    implements Factory<LodgementNodeChildProvider> {
  private final MembersInjector<LodgementNodeChildProvider>
      lodgementNodeChildProviderMembersInjector;

  public LodgementNodeChildProvider_Factory(
      MembersInjector<LodgementNodeChildProvider> lodgementNodeChildProviderMembersInjector) {
    assert lodgementNodeChildProviderMembersInjector != null;
    this.lodgementNodeChildProviderMembersInjector = lodgementNodeChildProviderMembersInjector;
  }

  @Override
  public LodgementNodeChildProvider get() {
    return MembersInjectors.injectMembers(
        lodgementNodeChildProviderMembersInjector, new LodgementNodeChildProvider());
  }

  public static Factory<LodgementNodeChildProvider> create(
      MembersInjector<LodgementNodeChildProvider> lodgementNodeChildProviderMembersInjector) {
    return new LodgementNodeChildProvider_Factory(lodgementNodeChildProviderMembersInjector);
  }
}

package zhy2002.examples.app.gen;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class LodgementNodeClassRegistry_Factory
    implements Factory<LodgementNodeClassRegistry> {
  private final MembersInjector<LodgementNodeClassRegistry>
      lodgementNodeClassRegistryMembersInjector;

  public LodgementNodeClassRegistry_Factory(
      MembersInjector<LodgementNodeClassRegistry> lodgementNodeClassRegistryMembersInjector) {
    assert lodgementNodeClassRegistryMembersInjector != null;
    this.lodgementNodeClassRegistryMembersInjector = lodgementNodeClassRegistryMembersInjector;
  }

  @Override
  public LodgementNodeClassRegistry get() {
    return MembersInjectors.injectMembers(
        lodgementNodeClassRegistryMembersInjector, new LodgementNodeClassRegistry());
  }

  public static Factory<LodgementNodeClassRegistry> create(
      MembersInjector<LodgementNodeClassRegistry> lodgementNodeClassRegistryMembersInjector) {
    return new LodgementNodeClassRegistry_Factory(lodgementNodeClassRegistryMembersInjector);
  }
}

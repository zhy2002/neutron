package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.RentedFlagNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class RentedFlagNode_MembersInjector implements MembersInjector<RentedFlagNode> {
  private final Provider<RentedFlagNodeComponent.Builder> builderProvider;

  public RentedFlagNode_MembersInjector(Provider<RentedFlagNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<RentedFlagNode> create(
      Provider<RentedFlagNodeComponent.Builder> builderProvider) {
    return new RentedFlagNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(RentedFlagNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      RentedFlagNode instance, Provider<RentedFlagNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}

package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.HouseDutiesFlagNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class HouseDutiesFlagNode_MembersInjector
    implements MembersInjector<HouseDutiesFlagNode> {
  private final Provider<HouseDutiesFlagNodeComponent.Builder> builderProvider;

  public HouseDutiesFlagNode_MembersInjector(
      Provider<HouseDutiesFlagNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<HouseDutiesFlagNode> create(
      Provider<HouseDutiesFlagNodeComponent.Builder> builderProvider) {
    return new HouseDutiesFlagNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(HouseDutiesFlagNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      HouseDutiesFlagNode instance,
      Provider<HouseDutiesFlagNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}

package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.HousingStatusNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class HousingStatusNode_MembersInjector implements MembersInjector<HousingStatusNode> {
  private final Provider<HousingStatusNodeComponent.Builder> builderProvider;

  public HousingStatusNode_MembersInjector(
      Provider<HousingStatusNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<HousingStatusNode> create(
      Provider<HousingStatusNodeComponent.Builder> builderProvider) {
    return new HousingStatusNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(HousingStatusNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      HousingStatusNode instance, Provider<HousingStatusNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}

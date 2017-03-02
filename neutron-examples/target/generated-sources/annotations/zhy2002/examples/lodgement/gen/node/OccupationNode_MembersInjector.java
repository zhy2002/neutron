package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.OccupationNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class OccupationNode_MembersInjector implements MembersInjector<OccupationNode> {
  private final Provider<OccupationNodeComponent.Builder> builderProvider;

  public OccupationNode_MembersInjector(Provider<OccupationNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<OccupationNode> create(
      Provider<OccupationNodeComponent.Builder> builderProvider) {
    return new OccupationNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(OccupationNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      OccupationNode instance, Provider<OccupationNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}

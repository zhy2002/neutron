package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.ProfitThisYearNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProfitThisYearNode_MembersInjector
    implements MembersInjector<ProfitThisYearNode> {
  private final Provider<ProfitThisYearNodeComponent.Builder> builderProvider;

  public ProfitThisYearNode_MembersInjector(
      Provider<ProfitThisYearNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<ProfitThisYearNode> create(
      Provider<ProfitThisYearNodeComponent.Builder> builderProvider) {
    return new ProfitThisYearNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(ProfitThisYearNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      ProfitThisYearNode instance, Provider<ProfitThisYearNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}

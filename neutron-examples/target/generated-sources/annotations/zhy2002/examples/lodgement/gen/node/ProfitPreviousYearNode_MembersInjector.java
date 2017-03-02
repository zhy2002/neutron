package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.ProfitPreviousYearNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProfitPreviousYearNode_MembersInjector
    implements MembersInjector<ProfitPreviousYearNode> {
  private final Provider<ProfitPreviousYearNodeComponent.Builder> builderProvider;

  public ProfitPreviousYearNode_MembersInjector(
      Provider<ProfitPreviousYearNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<ProfitPreviousYearNode> create(
      Provider<ProfitPreviousYearNodeComponent.Builder> builderProvider) {
    return new ProfitPreviousYearNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(ProfitPreviousYearNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      ProfitPreviousYearNode instance,
      Provider<ProfitPreviousYearNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}

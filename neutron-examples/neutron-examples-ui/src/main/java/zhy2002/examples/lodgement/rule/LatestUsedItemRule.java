package zhy2002.examples.lodgement.rule;

import com.google.common.base.Strings;
import zhy2002.neutron.EventBinding;
import zhy2002.neutron.UiNodeRule;
import zhy2002.neutron.data.StringOption;
import zhy2002.neutron.di.Owner;
import zhy2002.neutron.event.StringStateChangeEvent;
import zhy2002.neutron.event.StringStateChangeEventBinding;
import zhy2002.neutron.node.StringUiNode;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;


public class LatestUsedItemRule extends UiNodeRule<StringUiNode<?>> {

    @Inject
    protected LatestUsedItemRule(@Owner StringUiNode<?> owner) {
        super(owner);
    }

    @Override
    protected Collection<EventBinding> createEventBindings() {
        return Collections.singletonList(
                new StringStateChangeEventBinding(
                        e -> getOwner().getOptions() != null,
                        this::updateList
                )
        );
    }

    private void updateList(StringStateChangeEvent event) {
        //todo skip this is is loading

        String value = event.getNewValue();
        if (Strings.isNullOrEmpty(value))
            return;

        StringOption[] options = getOwner().getOptions();
        StringOption emptyOption = null;
        StringOption justUsedOption = null;
        List<StringOption> newOptions = new ArrayList<>();
        for (Object option : options) {
            StringOption stringOption = (StringOption) option;
            if (value.equals(stringOption.getValue())) {
                justUsedOption = stringOption;
            } else if (Strings.isNullOrEmpty(stringOption.getValue())) {
                emptyOption = stringOption;
            } else {
                newOptions.add(stringOption);
            }
        }

        if (justUsedOption == null)
            return;
        else {
            newOptions.add(0, justUsedOption);
        }

        if (emptyOption != null) {
            newOptions.add(0, emptyOption);
        }

        getOwner().setOptions(newOptions.toArray(new StringOption[newOptions.size()]));
    }
}

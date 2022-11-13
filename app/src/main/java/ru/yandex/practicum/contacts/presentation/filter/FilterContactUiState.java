package ru.yandex.practicum.contacts.presentation.filter;

import java.util.Collections;
import java.util.Set;

import ru.yandex.practicum.contacts.model.ContactType;

class FilterContactUiState {
    private boolean isApplyEnable = false;
    private Set<ContactType> newSelectedContactTypes = Collections.emptySet();

    public boolean getApplyEnable() {
        return isApplyEnable;
    }

    public Set<ContactType> getNewSelectedContactTypes() {
        return newSelectedContactTypes;
    }

    public void setApplyEnable(boolean applyEnable) {
        isApplyEnable = applyEnable;
    }

    public void setNewSelectedContactTypes(Set<ContactType> newSelectedContactTypes) {
        this.newSelectedContactTypes = newSelectedContactTypes;
    }
}

package com.kodilla.stream.invoice.simple;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public final class SimpleInvoice {
    private final List<SimpleItem> items = new ArrayList<>();

    public void addItem(SimpleItem item){
        items.add(item);
    }

    public void removeItem(SimpleItem item) {
        items.remove(item);
    }

    public double getValueToPay(){
        return items.stream()
                .collect(Collectors.summingDouble(SimpleItem::getValue));
    }
}

package com.example.jojoclicer;

public class UnitAdapter extends ArrayAdapter<Unit>{
    public UnitAdapter(Context context, Unit[] units){
        super(context, R.layout.unit, units);
    }
    public UnitAdapter(Context context, ArrayAdapter<Unit> unit){
        super(context, R.layout.unit, units);
    }
    @Override
    public View getView(int position, View view, ViewGroup viewGroup){
        final Unit unit = getItem(position);
        If (view =-null)
            view= LayoutInflater.from(getContext()).interface(R.layout.unit, null);
        ((ImageView) view.findViewById(R.Id.image_view_unit)).setImageResurce(unit.getImage());
        ((TextView) view.findViewById(R.Id.text_view_unit_name)).setText(unit.getName());
        ((TextView) view.findViewById(R.Id.text_view_unit_age)).settext(unit.getAge());
        }
}

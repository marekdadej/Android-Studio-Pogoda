package com.example.weatherapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class CityAdapter extends RecyclerView.Adapter<CityAdapter.CityViewHolder> {

    private List<City> cityList;

    public CityAdapter(List<City> cityList) {
        this.cityList = cityList;
    }

    @NonNull
    @Override
    public CityViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_city, parent, false);
        return new CityViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CityViewHolder holder, int position) {
        City city = cityList.get(position);
        holder.tvCityName.setText(city.getName());
        holder.tvProvince.setText(city.getProvince());
        holder.tvRainChance.setText(city.getRainChance() + "%");
        holder.tvTemperature.setText(city.getTemperature() + "°");
        holder.ivWeatherIcon.setImageResource(city.getWeatherIcon());
    }

    @Override
    public int getItemCount() {
        return cityList.size();
    }

    public static class CityViewHolder extends RecyclerView.ViewHolder {
        TextView tvCityName, tvProvince, tvRainChance, tvTemperature;
        ImageView ivWeatherIcon;

        public CityViewHolder(@NonNull View itemView) {
            super(itemView);
            tvCityName = itemView.findViewById(R.id.tvCityName);
            tvProvince = itemView.findViewById(R.id.tvProvince);
            tvRainChance = itemView.findViewById(R.id.tvRainChance);
            tvTemperature = itemView.findViewById(R.id.tvTemperature);
            ivWeatherIcon = itemView.findViewById(R.id.ivWeatherIcon);
        }
    }
}

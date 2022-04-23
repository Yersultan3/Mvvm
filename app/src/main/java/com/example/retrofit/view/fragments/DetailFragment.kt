package com.example.retrofit.view.fragments

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.example.retrofit.databinding.FragmentDetailBinding
import com.squareup.picasso.Picasso

class DetailFragment: Fragment() {

    private lateinit var binding: FragmentDetailBinding
    private val args: DetailFragmentArgs by navArgs()
//    private lateinit var viewModel: MovieDetailViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentDetailBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.progressBar.visibility = View.GONE

//        initAndObserveViewModel()

//        viewModel.getCoroutinesMovieById()
        binding.tvTitle.text = args.movie.title
        Picasso.get().load("https://image.tmdb.org/t/p/w500" + args.movie.poster_path).into(binding.detailMoviePoster)

    }



//    private fun initAndObserveViewModel() {
//        viewModel = ViewModelProvider(this)[MovieDetailViewModel::class.java]
//
//        viewModel.liveData.observe(
//            this,
//            {
//                Picasso.get().load("https://image.tmdb.org/t/p/w500" + it.poster_path).into(binding.detailMoviePoster)
//                binding.tvTitle.text = it.title
//            }
//        )
//    }
}